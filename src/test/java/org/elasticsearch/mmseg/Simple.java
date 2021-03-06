package org.elasticsearch.mmseg;

import com.chenlb.mmseg4j.Seg;
import com.chenlb.mmseg4j.SimpleSeg;

import java.io.IOException;

/**
 * 
 * @author chenlb 2009-3-14 上午12:38:40
 */
public class Simple extends Complex {

    public Simple(String path) {
        super(path);
    }

    protected Seg getSeg() {

		return new SimpleSeg(dic);
	}

	public static void main(String[] args) throws IOException {
		new Simple("D:\\tools\\JetBrains\\IntelliJ IDEA 13.1.2\\elasticsearch-plugins\\elasticsearch-analysis-mmseg\\config\\mmseg").run(args);
	}

}
