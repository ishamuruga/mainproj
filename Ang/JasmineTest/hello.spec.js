
describe('hello world', function () {
  describe('hello()', function () {
    it('should return "Hello World!"', function () {
      expect(hello()).toBe('Hello World!');
    });
  });

  describe('GetNames()', function () {
    it('should return "Hello World!"', function () {
      expect(names().length).toBe(3);
    });
  });
});

