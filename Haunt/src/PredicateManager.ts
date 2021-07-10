import { Predicate } from "sandstone";

// is the player in the dark
export const IsInTheDark = Predicate('predicate_manager/is_in_the_dark', {
    condition: 'minecraft:location_check',
        predicate: {
            light: 0
        }
})