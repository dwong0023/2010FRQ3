package com.company;

public class Trail {
    private int[] markers;

    public Trail(int[] trail)
    {
        this.markers = trail;
    }

    public boolean isLevelTrailSegment(int start, int end)
    {
        int min = this.markers[start];
        int max = this.markers[end];
        for(int i = start + 1; i <= end; i++)
        {
            if(min > this.markers[i])
            {
                min = this.markers[i];
            }
            if(max > this.markers[i])
            {
                max = this.markers[i];
            }
        }
        return((max-min) <= 10);
    }

    public boolean isDifficult()
    {
        int numberofchanges = 0;

        for(int i = 0; i < this.markers.length-1;i++)
        {
            if (Math.abs(this.markers[i] - this.markers[i + 1]) >= 30)
            {

                numberofchanges++;
            }
        }
        return (numberofchanges>= 3);
    }
}
