# Get items Scoreboards
scoreboard objectives add h.item.WD dummy


# Start Loops
schedule clear haunt_darkness:give_item
function haunt_darkness:give_item

# Announce to Chat
tellraw @p [{"text": "[Haunt]: ", "bold": true, "color": "yellow"}, {"text": "Loaded module `", "italic": false, "color": "white"}, {"text": "Hidden in the darkness", "color": "green", "italic": true, "hoverEvent":{"action":"show_text","contents":"Beware the darkness, it haunts you...\n\nCampfires are your friend"}}]