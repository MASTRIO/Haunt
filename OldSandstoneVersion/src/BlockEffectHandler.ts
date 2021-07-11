import { MCFunction, execute, rel, _ } from "sandstone";
import { AllPlayers, NearestPlayer } from "./SelectorManager";
import { BelowOneBlock, CoordYourIn } from "./CoordinateManager";
import { namespace } from "./Main";

const haunt = 'block_effect_handler'

// Soul Soil Slowing
MCFunction(haunt + '/soul_soil_slowing', () => {
    execute.at(AllPlayers).if.block(BelowOneBlock, 'minecraft:soul_soil').run.functionCmd(namespace + ':potion_effect_manager/soul_soil')
}, {
    runEachTick: true
})

// Campfire Crisping
MCFunction(haunt + '/campfire_crisping', () => {
    execute.at(AllPlayers).if.block(CoordYourIn, 'minecraft:campfire').run.kill(NearestPlayer)
}, {
    runEachTick: true
})