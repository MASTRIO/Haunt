import type { SandstoneConfig } from 'sandstone'

export default {
  name: 'Haunt',
  description: [ 'Makes the game ', { text: 'MUCH', color: 'gold' }, ' harder ' ],
  formatVersion: 6,
  namespace: 'haunt',
  packUid: 'k86VRhxE',
  saveOptions: { world: 'Haunt Testing World' },
  onConflict: {
    default: 'warn',
  },
} as SandstoneConfig
