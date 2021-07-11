# Kill Bonfire marker
execute at @e[tag=haunt.darkness.bonfire.marker] if block ~ ~ ~ minecraft:campfire run kill @e[tag=haunt.darkness.bonfire.marker, sort=nearest, limit=1]

# Restart loop
schedule function haunt:loop/quarter_second 5t