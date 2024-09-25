package bangunruang;
class Kubus extends BangunRuang {
    double side;
    
    public Kubus (double side) {
        this.side = side;
    }

    @Override
    double calculateVolume() {
    return Math.pow(side, 3);
    }

    @Override
    double calculateSurfaceArea() {
    return 6 * Math.pow(side, 2);
    }
}
