# Soul slowing
execute at @a if block ~ ~-1 ~ minecraft:soul_soil run function haunt:block_effects/soul_soil_slowing
execute at @a if block ~ ~-1 ~ minecraft:soul_sand run function haunt:block_effects/soul_sand_slowing

# Campfire crisping
execute at @a if block ~ ~ ~ minecraft:campfire[lit=true] run function haunt:block_effects/campfire_crisping

# Soul Campfire crisping
execute at @a if block ~ ~ ~ minecraft:soul_campfire[lit=true] run function haunt:block_effects/soul_campfire_crisping