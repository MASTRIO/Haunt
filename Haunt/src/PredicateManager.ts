import { Predicate } from "sandstone";

const haunt = 'predicate_manager'

// is the player in the dark
export const IsInTheDark = Predicate(haunt + '/is_in_the_dark', {
    condition: 'minecraft:entity_properties',
    predicate: {
        location: {
            light: {
                light: {
                    min: 0,
                    max: 3
                }
            }
        }
    }
})