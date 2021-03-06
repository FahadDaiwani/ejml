/*
 * Copyright (c) 2009-2017, Peter Abeles. All Rights Reserved.
 *
 * This file is part of Efficient Java Matrix Library (EJML).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ejml.sparse.csc.decomposition.chol;

import org.ejml.data.DMatrixSparseCSC;
import org.ejml.interfaces.decomposition.CholeskySparseDecomposition_F64;

public class TestCholeskyUpLooking_DSCC extends GenericCholeskyTests_DSCC {

    public TestCholeskyUpLooking_DSCC() {
        canR = false;
    }

    @Override
    public CholeskySparseDecomposition_F64<DMatrixSparseCSC> create(boolean lower) {
        return new CholeskyUpLooking_DSCC();
    }
}
