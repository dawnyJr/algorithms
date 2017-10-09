import recfun
import unittest


class TestRecFun(unittest.TestCase):

    def test_pascal(self):
        self.assertEqual(recfun.pascal(3,3), 1)
        self.assertEqual(recfun.pascal(0,0), 1)
        self.assertEqual(recfun.pascal(4,2), 6)
        self.assertEqual(recfun.pascal(-2,3), 0)
        self.assertEqual(recfun.pascal(2,-1), 0)
        self.assertEqual(recfun.pascal(-6,-6), 0)
        self.assertEqual(recfun.pascal(7,2), 21)

if __name__ == '__main__':
    unittest.main()
