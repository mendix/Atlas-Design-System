import { Vibration } from 'react-native';

// BEGIN EXTRA CODE
// END EXTRA CODE
/**
 * @param {Big} duration - Android only setting. The time (in milliseconds) the device should vibrate. Set to empty to use the default value 500.
 * @returns {Promise.<void>}
 */
async function Vibrate(duration) {
    // BEGIN USER CODE
    // Documentation https://facebook.github.io/react-native/docs/vibration#vibrate
    const pattern = duration ? Number(duration) : 500;
    Vibration.vibrate(pattern, false);
    return Promise.resolve();
    // END USER CODE
}

export { Vibrate };
