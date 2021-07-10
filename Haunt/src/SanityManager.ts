import { MCFunction, Variable, _, say } from 'sandstone'
import { playersSanity } from './main'

// Stop sanity from going in wrong level
MCFunction('sanity_stabilizer', () => {
    _
        .if(playersSanity.greaterOrEqualThan(150), () => {
            playersSanity.set(150)
        })
        .elseIf(playersSanity.lessOrEqualThan(0), () => {
            playersSanity.set(0)
        })
}, {
    runEachTick: true
})