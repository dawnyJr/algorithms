import bubble_sort as sort
import unittest

class TestBubbleSort(unittest.TestCase):

        def test_bubble_sort(self):
            # Unsorted array
            initial_array = [78, 65, 3, 0, 65, 45, 23, 12, 7, -43, -107, 57]
            expected_array = [-107, -43, 0, 3, 7, 12, 23, 45, 57, 65, 65, 78]
            sort.bubble_sort(initial_array)
            self.assertEqual(expected_array, initial_array)
            # Array with one item
            initial_array = [1] 
            expected_array = [1]
            sort.bubble_sort(initial_array)
            self.assertEqual(expected_array, initial_array)
            # Empty array
            initial_array = [] 
            expected_array = []
            sort.bubble_sort(initial_array)
            self.assertEqual(expected_array, initial_array)
            # None object 
            initial_array = None
            expected_array = None
            sort.bubble_sort(initial_array)
            self.assertEqual(expected_array, initial_array)

if __name__ == '__main__':
    unittest.main()
