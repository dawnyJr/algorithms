
import unittest 
import linear_search as search 

class TestLinearSearch(unittest.TestCase):

    def setUp(self):
        list = [3, 5, 12, -5, 0, 45, 78]

    def test_search_item(self):
        self.assertEqual(2, search.linear_search(list, 12))

    def test_search_first(self):
        self.assertEqual(0, search.linear_search(list, 3))

    def test_search_last(self):
        self.assertEqual(6, search.linear_search(list, 78))

    def test_search_inexisting(self):
        self.assertEqual(-1, search.linear_search(list, 4))

if __name__ == '__main__':
    unittest.main()
