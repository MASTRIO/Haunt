setblock ~ ~ ~ minecraft:campfire[signal_fire=true]
summon minecraft:villager ~ ~ ~ {Tags:[haunt.darkness.bonfire.trader],CustomName:"\"Bonfire\"",CustomNameVisible:0,NoAI:1,Silent:1b,Invulnerable:1,CanPickUpLoot:0b,NoGravity:1b,HasVisualFire:1}
kill @e[tag=haunt.darkness.bonfire.spawner, sort=nearest]