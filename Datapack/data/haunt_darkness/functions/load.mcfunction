# Start loops
function haunt_darkness:loop/quarter_second

# Announce to Chat
tellraw @p [{"text": "[Haunt]: ", "bold": true, "color": "yellow"}, {"text": "Loaded module `", "italic": false, "color": "white"}, {"text": "Hidden in the darkness", "color": "green", "italic": true, "hoverEvent":{"action":"show_text","contents":"Beware the darkness, it haunts you...\n\nCampfires are your friend"}}, {"text": "` [WIP]", "italic": false, "color": "white"}]