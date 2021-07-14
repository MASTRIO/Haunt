# [Catagory] General
data merge entity @s {Offers:{Recipes:[{buyB:{id:structure_void,Count:1,tag:{display:{Name:'[{"translate":"catagory.haunt.bonfire.general","italic":false,"color": "white"}]'},CustomModelData:7897891}},maxUses:0,rewardExp:false}]}}

# Campfire
data modify entity @s Offers.Recipes append value {buy:{id:"minecraft:oak_log",Count:3b},buyB:{id:"minecraft:stick",Count:1b},sell:{id:"minecraft:campfire",Count:1b},maxUses:999999}

# Torch
data modify entity @s Offers.Recipes append value {buy:{id:"minecraft:stick",Count:3b},buyB:{id:"minecraft:wheat",Count:2b},sell:{id:"minecraft:torch",Count:3b},maxUses:999999}

# [Catagory] Tools
data modify entity @s Offers.Recipes append value {buyB:{id:structure_void,Count:1,tag:{display:{Name:'[{"translate":"catagory.haunt.bonfire.tools","italic":false,"color": "white"}]'},CustomModelData:7897892}},maxUses:0,rewardExp:false}

# [Catagory] Weapons
data modify entity @s Offers.Recipes append value {buyB:{id:structure_void,Count:1,tag:{display:{Name:'[{"translate":"catagory.haunt.bonfire.weapons","italic":false,"color": "white"}]'},CustomModelData:7897893}},maxUses:0,rewardExp:false}

# Wooden Dagger
data modify entity @s Offers.Recipes append value {buy:{id:"minecraft:stick",Count:1b},buyB:{id:"minecraft:oak_log",Count:1b},sell:{id:"minecraft:wooden_sword",Count:1b,tag:{haunt_darkness_giveItem_woodenDagger:1,CustomModelData:7897891,display:{Name:'[{"translate":"item.haunt.darkness.wooden_dagger.name","italic":false,"color": "white"}]'}},maxUses:999999}}

# [Catagory] Defence
data modify entity @s Offers.Recipes append value {buyB:{id:structure_void,Count:1,tag:{display:{Name:'[{"translate":"catagory.haunt.bonfire.defence","italic":false,"color": "white"}]'},CustomModelData:7897894}},maxUses:0,rewardExp:false}

# [Catagory] Magical
data modify entity @s Offers.Recipes append value {buyB:{id:structure_void,Count:1,tag:{display:{Name:'[{"translate":"catagory.haunt.bonfire.magical","italic":false,"color": "white"}]'},CustomModelData:7897895}},maxUses:0,rewardExp:false}

# [Catagory] Food
data modify entity @s Offers.Recipes append value {buyB:{id:structure_void,Count:1,tag:{display:{Name:'[{"translate":"catagory.haunt.bonfire.food","italic":false,"color": "white"}]'},CustomModelData:7897896}},maxUses:0,rewardExp:false}