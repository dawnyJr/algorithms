import merge_sort as sort
import unittest

class TestMergeSort(unittest.TestCase):

    def setUp(self):
        self.odd_array = [87, 43, 108, 2, 8, 1, 56, -24, 6]
        self.even_array = [87, 43, 2, 8, 1, 56, -24, 6]
        self.odd_sorted_array = [-24, 1, 2, 6, 8, 43, 56, 87, 108]
        self.even_sorted_array = [-24, 1, 2, 6, 8, 43, 56, 87]
        self.one_item = [2]

    def test_merge_sort(self):
        sort.merge_sort(self.odd_array)
        sort.merge_sort(self.even_array)
        sort.merge_sort(self.one_item)
        self.assertEqual(self.odd_sorted_array, self.odd_array)
        self.assertEqual(self.even_sorted_array, self.even_array)
        self.assertEqual(self.one_item, self.one_item)


if __name__ == '__main__':
    unittest.main()
