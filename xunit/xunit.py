class TestCase:
    def __init__(self, name):
        self.name = name
    def run(self):
        method = getattr(self, self.name)
        method()


class WasRun(TestCase):
    # pass
    def __init__(self, name):
        self.wasRun = None
        # self.name = name
        super().__init__(name)
        
    # def run(self):
    #     method = getattr(self, self.name)
    #     method()
    #     # self.testMethod()
        
    def testMethod(self):
        self.wasRun = 1
        
class TestCaseTest(TestCase):
    def testRunning(self):
        test = WasRun("testMethod")
        assert(not test.wasRun)
        test.run()
        assert(test.wasRun)
        

TestCaseTest("testRunning").run()
        
    

# test = WasRun("testMethod")
# print(test.wasRun)
# # test.testMethod()
# test.run()
# print(test.wasRun)