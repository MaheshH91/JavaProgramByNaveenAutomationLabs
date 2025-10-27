package interviewPrograms.finalKeywordPrograms;

class Parent {
    public final void showMessage() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // public void showMessage() { } // ❌ Compilation error: cannot override final method
}