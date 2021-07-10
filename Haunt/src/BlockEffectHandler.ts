import { MCFunction, execute, rel } from "sandstone";
import { AllPlayers, Yourself } from "./SelectorManager";
import { BelowOneBlock } from "./CoordinateManager";

// Soul Soil Slowing
MCFunction('block_effect_handler/soul_soil_slowing', () => {
    execute.as(AllPlayers).if.block(BelowOneBlock, 'minecraft:soul_soil').run.effect.give(Yourself, 'minecraft:slowness', 1, 2, true)
}, {
    runEachTick: true
})