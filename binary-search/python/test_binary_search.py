
import binary_search as search
import unittest


class TestBinSearch(unittest.TestCase):

    def test_binary_search(self):
        array = [-107, -43, 0, 3, 7, 12, 23, 45, 57, 65, 65, 78]
        self.assertEqual(2, search.binary_search(array, 0))
        self.assertEqual(-1, search.binary_search(array, 16))
        # Empty array
        self.assertEqual(-1, search.binary_search([], 6))

    def test_recursive_binary_search(self):
        array = [-107, -43, 0, 3, 7, 12, 23, 45, 57, 65, 65, 78]
        self.assertEqual(2, search.binary_search(array, 0))
        self.assertEqual(-1, search.binary_search(array, 16))
        # Empty array
        self.assertEqual(-1, search.binary_search([], 6))



if __name__ == '__main__':
    unittest.main()
