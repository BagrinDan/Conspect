
    
    @Override
    public Student swallowCopy() {
        return new Student(this.name, this.grades);
    }

    @Override
    public Student deepCopy() {
        List<Integer> grades = new ArrayList<>(this.grades);
        return new Student(this.name, grades);
    }

