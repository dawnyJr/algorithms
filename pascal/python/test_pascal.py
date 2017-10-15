import pascal as p
import unittest


class TestRecFun(unittest.TestCase):

    def test_pascal(self):
        self.assertEqual(p.pascal(3,3), 1)
        self.assertEqual(p.pascal(0,0), 1)
        self.assertEqual(p.pascal(4,2), 6)
        self.assertEqual(p.pascal(-2,3), 0)
        self.assertEqual(p.pascal(2,-1), 0)
        self.assertEqual(p.pascal(-6,-6), 0)
        self.assertEqual(p.pascal(7,2), 21)

if __name__ == '__main__':
    unittest.main()
