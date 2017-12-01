import unittest 
import selection_sort as sort

class TestSelectionSort(unittest.TestCase):

    def test_already_sorted_array(self):
        reference_array = [-3, 0, 4, 8, 16, 45, 95, 165]
        array = [-3, 0, 4, 8, 16, 45, 95, 165]
        sort.selection_sort(array)
        self.assertEqual(reference_array, array)

    def test_sort_array(self):
        array1 = [5, 65, -5, 12, 56, 80, 8, 12]
        sort.selection_sort(array1)
        self.assertEqual([-5, 5, 8, 12, 12, 56, 65, 80], array1)
        array2 = [5]
        sort.selection_sort(array2)
        self.assertEqual([5], array2)

if __name__ == '__main__':
    unittest.main()
