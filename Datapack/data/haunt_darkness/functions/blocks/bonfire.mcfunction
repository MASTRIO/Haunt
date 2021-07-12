setblock ~ ~ ~ minecraft:campfire[signal_fire=true]
summon minecraft:villager ~ ~ ~ {Tags:[haunt.darkness.bonfire.trader],CustomName:"\"Bonfire\"",CustomNameVisible:0,NoAI:1b,Silent:1b,Invulnerable:1b,CanPickUpLoot:0b,NoGravity:1b,Fire:1277951}
kill @e[tag=haunt.darkness.bonfire.spawner, sort=nearest]