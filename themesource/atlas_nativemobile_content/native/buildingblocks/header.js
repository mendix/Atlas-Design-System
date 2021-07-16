import { background } from "../../../atlas_core/native/variables";
/*
==========================================================================
    Headers

==========================================================================
*/
export const header = {
    container: {
        height: 280,
        backgroundColor: background.primary
    }
};
//
// == Elements
// -------------------------------------------------------------------------------------------------------------------//
export const headerImageFull = {
    container: {
        overflow: "hidden"
    },
    image: {
        width: "100%",
        height: 280,
        resizeMode: "cover"
    }
};
export const headerBody = {
    container: {
        bottom: 0,
        zIndex: 11,
        width: "100%",
        position: "absolute",
        backgroundColor: "transparent"
    }
};
//
// == Variations
// -------------------------------------------------------------------------------------------------------------------//
