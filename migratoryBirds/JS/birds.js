const migratory = array => {
  const views = [0, 0, 0, 0, 0, 0];
  for (const sights of array) {
    views[sights] += 1;
  }

  const max = Math.max(...views);
  return views.indexOf(max);
}

module.exports = migratory;