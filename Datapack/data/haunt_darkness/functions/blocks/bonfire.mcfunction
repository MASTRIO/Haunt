setblock ~ ~ ~ minecraft:campfire[signal_fire=true]
summon minecraft:villager ~ ~ ~ {Tags:[haunt.darkness.bonfire.marker],CustomName:"\"Bonfire\"",CustomNameVisible:1,NoAI:1b}
kill @e[tag=haunt.darkness.bonfire.spawner, sort=nearest]