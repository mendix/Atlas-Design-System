import { unstable_enableLogBox, Dimensions } from "react-native";
import { spacing, background, border } from "../../../theme/native/custom-variables";

export const tile = {
  container: {
    backgroundColor: background.primary,
    borderColor: background.secondary,
    borderWidth: 1,
    padding: spacing.regular,

  },
};

export const tileHeader = {
  container: {
    marginBottom: spacing.regular,
  },
};

export const stretchedVideo = {
  container: {
    maxHeight: "100%",
  },
  video: {
    height: 200,
    width: 200,
  },
};

export const quarterScreenHeightContainer = {
  container: {
    height: Dimensions.get("window").height / 4,
  },
};

export const halfScreenHeightContainer = {
  container: {
    height: Dimensions.get("window").height / 2,
  },
};

export const backgroundColorBlack = {
  container: {
    backgroundColor: "#0A1325",
  },
};

export const containerPlaceHolder = {
  container: {
    height: 100,
    padding: spacing.smaller,
    backgroundColor: background.secondary,
    borderColor: border.color,
    borderWidth: 1,
  },
};

//
// Wrappers
export const width50PercentWrapper = {
  container: {
    width: "50%",
    padding: spacing.small,
  },
};

export const cardThumbnail = {
  container: {
    backgroundColor: "#7d92ef",
    height: 128,
    padding: spacing.regular,
    borderTopLeftRadius: border.radiusLarge,
    borderTopRightRadius: border.radiusLarge,
  },
  image: {
    resizeMode: 'contain',
  }
}

export const maxes = {
  container: {
    maxWidth: 300,
    maxHeight: 500,
  },

};

export const barChartStyleGrouped = {
  domain: {
    padding: {
		y: 20
	}
  }
};

export const barChartStyleStacked = {
  domain: {
    padding: {
		y: 10
	}
  },
  bars: {
	  customBarStyles: {
			barOne: {
				bar: {
					barColor: 'red'
				}
			},
			barTwo: {
				bar: {
					barColor: 'orange'
				}
			}			  
		  }
	  }
 };
 
 export const lineChartStyle = {
  lines: {
	  customLineStyles: {
			lineOne: {
				line: {
					lineColor: 'red'
				}
			},
			lineTwo: {
				line: {
					lineColor: 'orange'
				}
			}			  
		  }
	  }
 };
