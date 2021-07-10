import { MCFunction, kill } from "sandstone";
import { NonPlayerEntities } from "./SelectorManager"

// Kill everyone who isn't the player
MCFunction('debug/kill_non_player', () => {
    kill(NonPlayerEntities)
})