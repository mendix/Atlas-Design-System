const com_mendix_widget_native_linechart_LineChart = {
    lines: {
        customLineStyles: {
            line1: {
                line: {
                    lineColor: "orange"
                },
                markers: {
                    symbol: "diamond",
                    backgroundColoer: "red",
                    size: 10
                }
            },
            line2: {
                line: {
                    lineColor: "green"
                },
                markers: {
                    symbol: "square",
                    backgroundColoer: "yellow",
                    size: 10
                }
            }
        }
    }
}

const com_mendix_widget_native_barchart_BarChart = {
    grid: {
        paddingTop: 30,
        paddingRight: 25
    },
    bars: {
        barsOffset: 15,
        customBarStyles: {
            barone: {
                bar: {
                    barColor: "#887bb0",
                }
            },
            bartwo: {
                bar: {
                    barColor: "#85d2d0",
                }
            }
        }
    }
}

export {
    com_mendix_widget_native_linechart_LineChart,
    com_mendix_widget_native_barchart_BarChart
};
