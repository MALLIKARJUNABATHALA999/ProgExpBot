{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of frames: ");
        int numberOfFrames = sc.nextInt();
        System.out.print("Enter the number of pages: ");
        int numberOfPages = sc.nextInt();
        System.out.print("Enter the page reference string : ");
        int[] pages = new int[numberOfPages];
        for (int i = 0; i < numberOfPages; i++)
        {
            pages[i] = sc.nextInt();
        }
        int pageFaults = 0;
        int pageHits = 0;
        List<Integer> frameList = new ArrayList<>();
        for (int i = 0; i < numberOfPages; i++)
        {
            int currentPage = pages[i];
            if (frameList.contains(currentPage))
            {
                pageHits++;
                frameList.remove(Integer.valueOf(currentPage));
            }
            else
            {
                pageFaults++;
                if (frameList.size() == numberOfFrames)
                {
                    frameList.remove(0);
                }
            }
            frameList.add(currentPage);
        }
        System.out.println("Number of Page Faults: " + pageFaults);
        System.out.println("Number of Page Hits: " + pageHits);
        sc.close();
    }