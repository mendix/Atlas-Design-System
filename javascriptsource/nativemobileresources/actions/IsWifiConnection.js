import { fetch } from '@react-native-community/netinfo';

// This file was generated by Mendix Studio Pro.
// BEGIN EXTRA CODE
// END EXTRA CODE
/**
 * @returns {Promise.<boolean>}
 */
async function IsWifiConnection() {
    // BEGIN USER CODE
    return fetch().then((info) => info.type === "wifi");
    // END USER CODE
}

export { IsWifiConnection };
