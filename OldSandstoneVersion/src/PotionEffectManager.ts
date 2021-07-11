import { effect, MCFunction } from "sandstone";
import { NearestPlayer } from "./SelectorManager";

const haunt = 'potion_effect_manager'

// Soul Soil Effect
MCFunction(haunt + '/soul_soil', () => {
    effect.give(NearestPlayer, 'minecraft:slowness', 1, 4, true)
})