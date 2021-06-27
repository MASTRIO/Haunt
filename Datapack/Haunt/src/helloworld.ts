import { effect, execute, MCFunction, Objective, playsound, Predicate, rel, say, sleep, tellraw, time, Variable, _ } from "sandstone";

// Variables
const version = 'v0.1.0'
const sanityMeter = Objective.create('sanityMeter', 'dummy', [{
    text: 'Sanity',
    color: "red"
}])
const playersSanity = sanityMeter('@a')

// Darkness predicate
Predicate('is_in_dark', {
    condition: 'minecraft:location_check',
    predicate: {
        light: 0
    }
})

// Load
MCFunction('load', () => {
    say('Haunt datapack loaded! ' + version)
}, {
    runOnLoad: true
})

// Stop sanity from going in wrong level
MCFunction('sanity_stabilizer', () => {
    _
        .if(playersSanity.greaterOrEqualThan(150), () => {
            playersSanity.set(150)
        })
        .elseIf(playersSanity.lessOrEqualThan(0), () => {
            playersSanity.set(0)
        })
}, {
    runEachTick: true
})

MCFunction('darkness_death', () => {
    execute.as('@a').if.predicate('is_in_dark').run.kill
}, {
    runEachTick: true
})

// Start
MCFunction('start', () => {
    // Fancy stuff
    tellraw('@a', [{
        text: 'The hunt begins...',
        color: "red"
    }])
    playsound('minecraft:block.beacon.deactivate', 'neutral', '@a', rel(0, 0, 0), 1, 1, 1)
    effect.give('@a', 'minecraft:blindness', 2, 1, true)
    // Set base sanity
    playersSanity.set(150)
    // Start second loop
    five_second_loop_function()
})

// 5 Second Loop
const five_second_loop_function = MCFunction('five_second_loop', async () => {
    // Delay
    await sleep('5s')
    five_second_loop_function()
    // Decrease Sanity
    execute.as('@a').run.scoreboard.players.remove('@s', 'sanityMeter', 1)
})

// Get all players sanity
MCFunction('get_players_sanity', () => {
    tellraw('@a', ['Total players sanity: ', playersSanity])
})