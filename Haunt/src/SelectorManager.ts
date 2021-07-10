import { Selector } from "sandstone";
import { IsInTheDark } from "./PredicateManager";

// Player who foolishly went into the darkness
export const PlayerInTheDarkness = Selector('@a', { predicate: IsInTheDark})

// Non player entities
export const NonPlayerEntities = Selector('@e', { type: '!minecraft:player' })

// All Players
export const AllPlayers = Selector('@a')

// Yourself
export const Yourself = Selector('@s')

// Nearest Player
export const NearestPlayer = Selector('@p')