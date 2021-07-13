# Make invisible
effect give @e[tag=haunt.darkness.bonfire.trader,tag=!haunt.darkness.bonfire.trader.is_loaded,sort=nearest,limit=1] minecraft:invisibility 999999 1 true

# Make not die from dying things
effect give @e[tag=haunt.darkness.bonfire.trader,tag=!haunt.darkness.bonfire.trader.is_loaded,sort=nearest,limit=1] minecraft:resistance 999999 50 true
effect give @e[tag=haunt.darkness.bonfire.trader,tag=!haunt.darkness.bonfire.trader.is_loaded,sort=nearest,limit=1] minecraft:regeneration 999999 255 true

# Load trades
execute as @e[tag=haunt.darkness.bonfire.trader,tag=!haunt.darkness.bonfire.trader.is_loaded,sort=nearest,limit=1] run function haunt_darkness:blocks/bonfire/villager_trades

# Complete load
tag @e[tag=haunt.darkness.bonfire.trader,tag=!haunt.darkness.bonfire.trader.is_loaded,sort=nearest,limit=1] add haunt.darkness.bonfire.trader.is_loaded