# Create bonfire
execute at @e[tag=haunt.darkness.bonfire.spawner] run function haunt_darkness:blocks/bonfire

# Kill Bonfire marker
execute at @e[tag=haunt.darkness.bonfire.trader] unless block ~ ~ ~ minecraft:campfire run function haunt_darkness:blocks/bonfire/villager_kill

# Make villager invisible
execute at @e[tag=haunt.darkness.bonfire.trader,tag=!haunt.darkness.bonfire.trader.is_loaded] run function haunt_darkness:blocks/bonfire/villager_init