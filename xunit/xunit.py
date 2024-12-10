class TestCase:
    def __init__(self, name):
        self.name = name
    def setUp(self):
        pass
    
    def tearDown(self):
        pass
    
    def run(self):
        result = TestResult()
        result.testStarted()
        self.setUp()
        method = getattr(self, self.name)
        method()
        self.tearDown()
        return result


class WasRun(TestCase):
    # pass
    # def __init__(self, name):
    #     self.wasRun = None
    #     # self.name = name
    #     super().__init__(name)
    def setUp(self):
        # self.wasRun = None
        self.wasSetUp = 1 
        self.log = "setUp " 
    # def run(self):
    #     method = getattr(self, self.name)
    #     method()
    #     # self.testMethod()
    
    def testBrokenMethod(self):
        raise Exception
        
    def testMethod(self):
        # self.wasRun = 1
        self.log = self.log + "testMethod "
        
    def tearDown(self):
        self.log = self.log + "tearDown "
        
class TestResult:
    def __init__(self):
        self.runCount = 0
        
    def testStarted(self):
        self.runCount = self.runCount + 1
    
    def summary(self):
        return "%d run, 0 failed" % self.runCount
        
        
class TestCaseTest(TestCase):
    # def setUp(self):
    #     self.test =WasRun("testMethod")
    
    # def testRunning(self):
    #     # test = WasRun("testMethod")
    #     # assert(not test.wasRun)
    #     self.test.run()
        
    #     assert(self.test.wasRun)
    
    def testTemplateMethod(self):
        # test = WasRun("testMethod")
        test = WasRun("testMethod")
        test.run()
        assert("setUp testMethod tearDown " == test.log)
        assert(test.wasSetUp)
        
    def testResult(self):
        test = WasRun("testMethod")
        result = test.run()
        assert("1 run, 0 failed" == result.summary())

    def testFailedResult(self):
        test = WasRun("testBrokenMethod")
        result = test.run()
        assert("1 run, 1 failed" == result.summary())

# TestCaseTest("testRunning").run()
TestCaseTest("testResult").run()
TestCaseTest("testTemplateMethod").run()
# TestCaseTest("testFailedResult").run()

# test = WasRun("testMethod")
# print(test.wasRun)
# # test.testMethod()
# test.run()
# print(test.wasRun)