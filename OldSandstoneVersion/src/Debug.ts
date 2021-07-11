import { MCFunction, kill } from "sandstone";
import { NonPlayerEntities } from "./SelectorManager"

const haunt = 'debug'

// Kill everyone who isn't the player
MCFunction(haunt + '/kill_non_player', () => {
    kill(NonPlayerEntities)
})