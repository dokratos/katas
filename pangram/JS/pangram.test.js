const pangram = require("./pangram");

test("check that is a pangram", () => {
  expect(pangram("We promptly judged antique ivory buckles for the next prize")).toBe("pangram");
})

test("check that is not a pangram", () => {
  expect(pangram("")).toBe("not pangram");
})

test("che that sentence is not a pangram", () => {
  expect(pangram("We promptly judged antique ivory buckles for the prize")).toBe("not pangram");
})

