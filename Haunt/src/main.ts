import { effect, execute, MCFunction, Objective, playsound, Predicate, rel, say, sleep, tellraw, time, Variable, _, Selector } from "sandstone";
import { PlayerInTheDarkness } from "./SelectorManager";

// Variables
const version = 'v0.1.0'

// Load
MCFunction('load', () => {
    say('Haunt datapack loaded! ' + version)
}, {
    runOnLoad: true
})

// Die in the dark
// TODO: Move this to seperate file
MCFunction('die_in_the_dark', () => {
    execute.as(PlayerInTheDarkness).run.kill
}, {
    runEachTick: true
})

// Start the haunt
MCFunction('start', () => {
    // Fancy stuff
    tellraw('@a', [{
        text: 'The hunt begins...',
        color: "red"
    }])
    playsound('minecraft:block.beacon.deactivate', 'ambient', '@a', rel(0, 0, 0), 1, 1, 1)
    effect.give('@a', 'minecraft:blindness', 2, 1, true)
    // Set base sanity
    //playersSanity.set(150)
    // Start second loop
    FiveSecondLoop()
})

// 5 Second Loop
const FiveSecondLoop = MCFunction('five_second_loop', async () => {
    // Delay
    await sleep('5s')
    // Decrease Sanity
    //execute.as('@a').run.scoreboard.players.remove('@s', 'sanityMeter', 1)
    // Restart the loop
    FiveSecondLoop()
})

// Get all players sanity
// TODO: Move this to seperate file
const GetPlayerSanity = MCFunction('get_players_sanity', () => {
    //tellraw('@a', ['Total players sanity: ', playersSanity])
})