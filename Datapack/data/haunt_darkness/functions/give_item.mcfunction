# Wooden Dagger
execute as @a store success score @s h.item.WD run clear @s minecraft:wooden_sword{haunt_darkness_giveItem_woodenDagger:1} 0
execute as @a if score @s h.item.WD matches 1.. run function haunt_darkness:give_items/wooden_dagger

# Add all players to scoreboards
scoreboard players add @a h.item.WD 0

# Restart Loop
schedule function haunt_darkness:give_item 2t