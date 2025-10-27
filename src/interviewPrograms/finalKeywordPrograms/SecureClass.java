package interviewPrograms.finalKeywordPrograms;

final class SecureClass {
    public void display() {
        System.out.println("Secure class cannot be extended.");
    }
}

// class HackerClass extends SecureClass { } // ❌ Compilation error: cannot subclass final class