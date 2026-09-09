class Count_commas_ii{
    public long countCommas(long n) {
        long count = 0;

        for(long i = 1000; i<=n; i = i*1000){
            if(n > Long.MAX_VALUE) return count;
            count += (n-i+1);
        }

        return count;
    }
}