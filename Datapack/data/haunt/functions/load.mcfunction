# Version Scoreboard
scoreboard objectives add h.version dummy
scoreboard players set major h.version 0
scoreboard players set minor h.version 1
scoreboard players set patch h.version 0

# Load modules
function haunt_darkness:load
function haunt_parasites:load

# Chat message
tellraw @a [{"text": "Let the haunt begin ", "color": "red", "italic": true}, {"text": "(", "color": "green", "italic": false}, {"score":{"name":"major","objective":"h.version"}, "color": "green", "italic": false}, {"text": ".", "color": "green", "italic": false}, {"score":{"name":"minor","objective":"h.version"}, "color": "green", "italic": false}, {"text": ".", "color": "green", "italic": false}, {"score":{"name":"patch","objective":"h.version"}, "color": "green", "italic": false}, {"text": ")", "color": "green", "italic": false}]