package com.ejpm.kata.qualified.diskspace;

import java.util.*;

public class DiskSpace {

  public static boolean isWritable(int blockSize, int fileSize, Set<Integer> occupiedSectors) {

    final char[] disk = getTapeMemoryRepresentation(blockSize).toCharArray();

    occupiedSectors.forEach((sector) -> {
      disk[sector - 1] = '1';
    });

    int contigentSpace = 0;

    for (int i = 0; i < disk.length; i++) {
      if (disk[i] == '0') {
        contigentSpace++;
        if (contigentSpace == fileSize) {
          return true;
        }
      } else {
        contigentSpace = 0;
      }
    }

    return false;
  }

  public static String getTapeMemoryRepresentation(final int size) {
    return String.join("", Collections.nCopies(size, "0"));
  }
}
