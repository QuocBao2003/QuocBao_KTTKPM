public class StaticBlock {
    private static StaticBlock instance;
    private StaticBlock() {
            try {
                instance = new StaticBlock();
            } catch (Exception e) {
                throw new RuntimeException("Exception occured in creating singleton instance");
            }
    }
        public static StaticBlock getInstance(){
            return instance;
        }
}
