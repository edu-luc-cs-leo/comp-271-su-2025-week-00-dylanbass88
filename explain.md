### Explanation of Loops in Lines 40–45 of Realistic.java

The first loop runs from `i = 0` up to (but not including) `smallest_index`. That means it copies all elements from the beginning of the array up to the smallest element. It uses the same index `i` for both arrays, so the element from `arr[i]` goes directly into `temporary[i]`.

The second loop runs from `i = smallest_index + 1` up to the end of the array. This skips over the smallest element and copies everything after it. Since we already skipped one element, we use `i - 1` as the index for `temporary[]` to keep the new array lined up correctly.

In the first loop, nothing is skipped, so we copy as-is: `temporary[i] = arr[i];`. In the second loop, we’re one step ahead in the original array, so we place that value one step behind in the new array: `temporary[i - 1] = arr[i];`.

This way, the smallest value is removed, and the rest of the elements are copied into a smaller array.
