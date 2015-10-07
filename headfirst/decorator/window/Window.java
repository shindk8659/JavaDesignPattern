package.headfirst.decorator.window;

interface Window {
    public void draw(); // draws the Window
    public String getDescription(); // returns a description of the Window
}

// implementation of a simple Window without any scrollbars
class SimpleWindow implements Window {
    public void draw() {
        // draw window
    }

    public String getDescription() {
        return "simple window";
    }
}
