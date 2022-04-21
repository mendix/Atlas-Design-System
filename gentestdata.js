const rrand = (min, max) => {
    return Math.max(min, Math.round(Math.random() * max));
};

const companies = ["Alpha", "Beta", "Gamma"];

const pad = s => {
    const FIELD_SIZE = 8;
    if (s.length > FIELD_SIZE) {
        throw new Error(`string ${s} has more then ${FIELD_SIZE} symbols`);
    }

    const padSize = FIELD_SIZE - s.length;

    return [...s, ...Array(padSize).fill(" ")].join("");
};

for (let n = 0; n < 48; n++) {
    const row = [
        rrand(1, 10),
        rrand(1, 10),
        rrand(1, 100),
        companies[n % 3],
        n % 6,
        Math.floor(n / 6),
        rrand(1, 100),
        2016 + (n % 8)
    ].map(x => pad(x.toString()));

    console.log(row.join(","));
}
